package com.example.demo.repository;

import com.example.demo.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class UserRepository {

    private  JdbcTemplate jdbcTemplate;

    @Autowired
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    /*public UserRepository(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }*/



    private static class UserRowMapper implements RowMapper<User> {
        @Override
        public User mapRow(ResultSet rs, int rowNum) throws SQLException {
            return new User(rs.getInt("id"), rs.getString("username"), rs.getString("dni"), rs.getString("email"));
        }
    }

    public List<User> findAll() {
        return jdbcTemplate.query("SELECT * FROM users", new UserRowMapper());
    }

    public long insert(User user) throws DataAccessException {

        SimpleJdbcInsert simpleJdbcInsert = new SimpleJdbcInsert(jdbcTemplate.getDataSource()).withTableName("users")
                .usingGeneratedKeyColumns("id");



            String sql = "insert into users (dni,email,username) values (?, ?, ?)";
            return jdbcTemplate.update(sql,
                    user.getDni(),
                    user.getEmail(),
                    user.getUsername());



       /* SqlParameterSource parameters = new MapSqlParameterSource()
                .addValue("dni", user.getDni())
                .addValue("email",user.getEmail())
                .addValue("username", user.getUsername());
     *//*   Map<String, Object> parameters = new HashMap<>();
        parameters.put("name", user.getUsername());
        parameters.put("email", user.getEmail());
        parameters.put("dni", user.getDni());*//*
        System.out.println("data "+simpleJdbcInsert.getTableName());
        return simpleJdbcInsert.executeAndReturnKey(parameters).longValue();*/






    }
}
