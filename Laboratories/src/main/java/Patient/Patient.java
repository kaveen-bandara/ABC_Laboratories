package Patient;

import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "patients")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Patient {
    @Id
    private ObjectId id;
    private String patientId;
    private String firstName;
    private String lastname;
    private String gender;
    private String birthDate;
    private String address;
    private String phone;
    private String email;
}
