iimport org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {
	    private PaymentRepository paymentRepository;

	        public PaymentService(PaymentRepository paymentRepository) {
			        this.paymentRepository = paymentRepository;
				    }

		    public void initiatePayment(Payment payment) {
			            // Code to initiate payment using a payment library (e.g. Stripe or PayPal)
				    //         // If payment is successful, set payment status to "SUCCESS"
				    //                 // If payment fails, set payment status to "FAILED"
				    //                     }
				    //
				    //                         @Async
				    //                             public void retryPayment(Payment payment) {
				    //                                     // Code to retry failed payment using a payment library (e.g. Stripe or PayPal)
				    //                                             // If payment is successful, set payment status to "SUCCESS"
				    //                                                     // If payment fails again, set payment status to "FAILED"
				    //                                                         }
				    //
				    //                                                             @Scheduled(cron = "0 0 * * * *")
				    //                                                                 public void checkPendingPayments() {
				    //                                                                         // Find all payments with status "PENDING"
				    //                                                                                 List<Payment> pendingPayments = paymentRepository.findByStatus("PENDING");
				    //                                                                                         for (Payment payment : pendingPayments) {
				    //                                                                                                     // Check status of payment using payment library (e.g. Stripe or PayPal)
				    //                                                                                                                 if (payment.getStatus().equals("FAILED")) {
				    //                                                                                                                                 // If payment has failed, retry payment asynchronously
				    //                                                                                                                                                 retryPayment(payment);
				    //                                                                                                                                                             }
				    //                                                                                                                                                                     }
				    //                                                                                                                                                                         }
				    //                                                                                                                                                                         }
				    //
				    //
				    //                                                                                                                                                                         
		    }


public void retryPayment(Payment payment) {
	        // Code to retry failed payment using a payment library (e.g. Stripe or PayPal)
		//         // If payment is successful, set payment status to "SUCCESS"
		//                 // If payment fails again, set payment status to "FAILED"
		//                     }
}

 @Scheduled(cron = "0 0 * * * *")
     public void checkPendingPayments() {
	             // Find all payments with status "PENDING"
		              List<Payment> pendingPayments = paymentRepository.findByStatus("PENDING");
		                      for (Payment payment : pendingPayments) {
		     //                             // Check status of payment using payment library (e.g. Stripe or PayPal)
		                                             if (payment.getStatus().equals("FAILED")) {
		     //                                                         // If payment has failed, retry payment asynchronously
		                                                                              retryPayment(payment);
		                                                                                          }
		                                                                                                  }
     }
}
