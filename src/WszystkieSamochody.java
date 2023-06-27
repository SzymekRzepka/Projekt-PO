import java.sql.*;
import java.util.Scanner;

public class WszystkieSamochody {
    private KomisSamochodowy komis;

    public WszystkieSamochody(KomisSamochodowy komis, Scanner scanner) throws SQLException {
        this.komis = komis;
        String query = "SELECT * FROM samochody";
        Connection connection;
        Statement statement = komis.getConnection().createStatement();
        ResultSet resultSet = ((Statement) statement).executeQuery(query);

        while (resultSet.next()) {
            WyswietlSamochod.WyswietlSamochod(resultSet);
        }
    }
}
