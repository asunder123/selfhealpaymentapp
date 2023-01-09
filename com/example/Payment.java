import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Payment {
	    @Id
	        @GeneratedValue
		    private Long id;
	        private String status;

		    public Payment() { }

		        public Payment(String status) {
				        this.status = status;
					    }

			    public Long getId() {
				            return id;
					        }

			        public void setId(Long id) {
					        this.id = id;
						    }

				    public String getStatus() {
					            return status;
						        }

				        public void setStatus(String status) {
						        this.status = status;
							    }
}

