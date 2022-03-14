package simplilearn.org.in;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.project.SportyShoes.entity.UserDetails;
@Repository

public class UserDetailsRepository extends JpaRepository<UserDetails, Long> {
	public List<UserDetails> findByusername(String username);
	}
 

}
