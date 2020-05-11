package ejercicio6.models;

import java.util.*;

public class Club {
    private String name;
    private static Map<UUID, LinkedList<ClubMember>> presidentialElection;
    private ClubMember president;
    private List<ClubMember> partners;


    public Club(String init){
        name = init;
        presidentialElection = new HashMap<UUID,LinkedList<ClubMember>>();
        partners = new ArrayList<>();
    }

    public List<ClubMember> getPartners() { return partners;}

    public boolean associate (ClubMember newMember){
       return partners.add(newMember);
    }

    public boolean giveUp(ClubMember toQuit){
        return partners.removeIf(member -> member.getId()==toQuit.getId());
    }

    public String getName() {
        return name;
    }

    public ClubMember getPresident() {
        return president;
    }

    public void printPartners(){
        this.partners.forEach((partner)->{
            System.out.println(partner);
        });

    }

    public void initElections(){
        for(ClubMember allowed : partners){
            if(allowed.isAvaiableToVote()) {
                presidentialElection.put(allowed.getId(), new LinkedList<>());
            }
        }
    }

    public void addVote(ClubMember candidate ,ClubMember voter){
        if(!alreadyVote(voter)) {
            if (candidate.isAvaiableToVote() && candidate != voter) {
                LinkedList<ClubMember> votes = presidentialElection.get(candidate.getId());
                if (votes.size()>=0) {
                    votes.push(voter);
                }
            } else {
                System.out.println("This candidate: " +candidate.getName() + " isn't allowed to vote");
            }
        }
        else{
            System.out.println(voter.getName()+": You have already voted, you get penalty");
            voter.setAvaiableToVote(false);
            deleteCandidate(voter);

        }

    }

    private boolean alreadyVote(ClubMember voter){
        boolean voted = false;
       for(LinkedList votes : presidentialElection.values()){
           voted = votes.contains(voter);
           if(voted){
               break;
           }
       }
       return voted;
    }
    private void deleteCandidate(ClubMember candidate){
        presidentialElection.remove(candidate.getId());

    }

    private ClubMember getMember(UUID id){
        ClubMember result = null;

        for(ClubMember member : partners){
        if(member.getId()==id){
            result = member;
        }
        }
        return result;
    }

    public void voteCount() throws InterruptedException {
        int votes = 0;
        presidentialElection.entrySet().forEach(entry -> {
            UUID keyPresident = entry.getKey();
            int quantityVotes = entry.getValue().size();
            if(quantityVotes > votes && quantityVotes > 0 ){
                president = getMember(keyPresident);

            }
        });

        System.out.println("The new president of : " + this.getName() + " Is....");
        Thread.sleep(2000);
        System.out.println(getPresident().getName());


    }

}
