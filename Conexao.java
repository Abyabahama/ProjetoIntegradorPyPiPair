import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    // Configurações do banco de dados
    private static final String URL = "jdbc:mysql://localhost:3306/bdjogo?useSSL=false"; // substitua "nome_do_banco" pelo nome do seu banco de dados
    private static final String USUARIO = "root"; // substitua "usuario" pelo usuário do seu banco de dados
    private static final String SENHA = ""; // substitua "senha" pela senha do seu banco de dados

    // Método para estabelecer a conexão com o banco de dados
    public static Connection getConexao() {
        Connection conexao = null;
        try {
            // Carrega o driver JDBC
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Estabelece a conexão com o banco de dados
            conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Erro ao conectar com o banco de dados: " + e.getMessage());
        }
        return conexao;
    }

    // Método para fechar a conexão com o banco de dados
    public static void fecharConexao(Connection conexao) {
        if (conexao != null) {
            try {
                conexao.close();
            } catch (SQLException e) {
                System.err.println("Erro ao fechar a conexão com o banco de dados: " + e.getMessage());
            }
        }
    }
}
