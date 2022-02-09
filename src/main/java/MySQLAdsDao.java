import java.sql.*;
import com.mysql.cj.jdbc.Driver;
import java.util.ArrayList;
import java.util.List;

public class MySQLAdsDao implements Ads {
    private Connection connection;
    public MySQLAdsDao() {
        Config config = new Config();
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }

    @Override
    public List<Ad> all() {
        List<Ad> ads = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM ads");
            while (rs.next()) {
                ads.add(new Ad(
                        rs.getLong("id"),
                        rs.getLong("user_id"),
                        rs.getString("title"),
                        rs.getString("description")
                ));
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return ads;
    }

    @Override
    public Long insert(Ad ad) {
        long rowsAffected = 0;
        try {
            Statement statement = connection.createStatement();
            statement.executeUpdate("INSERT INTO ads (id, user_id, title, description) VALUES(" +
                    ad.getId() + ", " +
                    ad.getUserId() + ", " +
                    ad.getTitle() + ", " +
                    ad.getDescription() + ");", statement.RETURN_GENERATED_KEYS);
            ResultSet rs = statement.getGeneratedKeys();
            while (rs.next()) {
                System.out.println("Ad creation success");
                rowsAffected = rs.getLong(1);
            }

        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return rowsAffected;
    }
}
