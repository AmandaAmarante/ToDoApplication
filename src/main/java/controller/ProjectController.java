package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Project;
import util.ConnectionFactory;


public class ProjectController {

    public void save(Project project) {
        String sql = "INSERT INTO projects(name, description, createdAt, updatedAt) VALUES (?, ?, ?, ?)";

        Connection connection = null;
        PreparedStatement statement = null;

        try {
            //Cria uma conex�o com o banco
            connection = ConnectionFactory.getConnection();
            //Cria um PreparedStatment, classe usada para executar a query
            statement = connection.prepareStatement(sql);

            statement.setString(1, project.getName());
            statement.setString(2, project.getDescription());
            statement.setDate(3, new java.sql.Date(project.getCreatedAt().getTime()));
            statement.setDate(4, new java.sql.Date(project.getUpdatedAt().getTime()));

            //Executa a sql para inserir os dados
            statement.execute();
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao salvar o projeto", ex);
        } finally {
            //Fecha as conexões
           ConnectionFactory.closeConnection(connection, statement);
            }
    }
        

    


    public void update(Project project) {

        String sql = "UPDATE projects SET"
                + "name = ?,"
                + "description = ?,"
                + "createdAt = ?,"
                + "updatedAt = ?"
                + "WHERE id = ?";

        Connection connection = null;
        PreparedStatement statement = null;

        try {
            //Cria uma conex�o com o banco
            connection = ConnectionFactory.getConnection();
            //Cria um PreparedStatment, classe usada para executar a query
            statement = connection.prepareStatement(sql);

            statement.setString(1, project.getName());
            statement.setString(2, project.getDescription());
            statement.setDate(3, new java.sql.Date(project.getCreatedAt().getTime()));
            statement.setDate(4, new java.sql.Date(project.getUpdatedAt().getTime()));
            statement.setInt(5, project.getId());

            //Executa a sql para inserção dos dados
            statement.execute();
        } catch (SQLException ex) {
            throw new RuntimeException("Erro em atualizar o projeto", ex);
        } finally {
             //Fecha as conexões
           ConnectionFactory.closeConnection(connection, statement);
            
            
        }
    }

    public List<Project> getAll() {
        String sql = "SELECT * FROM projects";

        List<Project> projects = new ArrayList<>();

        Connection connection = null;
        PreparedStatement statement = null;

        //Classe que vai recuperar os dados do banco de dados
        ResultSet resultSet = null;

        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);

            resultSet = statement.executeQuery();

            //Enquanto existir dados no banco de dados, faça
            while (resultSet.next()) {

                Project project = new Project ();

                project.setId(resultSet.getInt("id"));
                project.setName(resultSet.getString("name"));
                project.setDescription(resultSet.getString("description"));
                project.setCreatedAt(resultSet.getDate("createdAt"));
                project.setCreatedAt(resultSet.getDate("updatedAt"));

                //Adiciono o contato recuperado, a lista de contatos
                projects.add(project);
            }
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao buscar os projetos", ex);
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
                }
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException ex) {
                throw new RuntimeException("Erro ao fechar a Connection", ex);
            }
        }
        return projects;
    }

    public void removeById(int idProject) {

        String sql = "DELETE FROM projects WHERE id = ?";

        Connection connection = null;
        PreparedStatement statement = null;

        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setInt(1, idProject);
            statement.execute();
        } catch (SQLException ex) {
            throw new RuntimeException("Erro ao deletar o projeto", ex);
        } finally {
            try {
                if (statement != null) {
                    statement.close();
                }
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException ex) {
                throw new RuntimeException("Erro ao fechar a Connection", ex);
            }
        }

    }

}
