import com.example.parkingdatabase.Color;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.junit.jupiter.api.Test;

public class JUnitTestRun {
    @Entity
    public class Car {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String IDname;
        private String model;
        private String manufacture;

        private Color color;

        public Car(String IDname, String model, String manufacture, Color color) {
            this.IDname = IDname;
            this.model = model;
            this.manufacture = manufacture;
            this.color = color;
        }

        public Car() {
        }

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getIDname() {
            return IDname;
        }

        public void setIDname(String IDname) {
            this.IDname = IDname;
        }

        public String getModel() {
            return model;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public String getManufacture() {
            return manufacture;
        }

        public void setManufacture(String manufacture) {
            this.manufacture = manufacture;
        }

        public Color getColor() {
            return color;
        }

        public void setColor(Color color) {
            this.color = color;
        }

        @Override
        public String toString() {
            return "Car{" +
                    "id=" + id +
                    ", IDname='" + IDname + '\'' +
                    ", model='" + model + '\'' +
                    ", manufacture='" + manufacture + '\'' +
                    ", color=" + color +
                    '}';
        }

    }

}
