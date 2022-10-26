package fabrice.raobera.carslease.invoice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


public class InvoiceService {
	@Autowired
	InvoiceRepository invoiceRepository;
	
	public Invoice save(Invoice invoice) {
		return invoiceRepository.save(invoice);
	}
	
	public List<Invoice> getAll(){
		return invoiceRepository.findAll();
	}
	
	public Invoice getById(long id) {
		return invoiceRepository.findById(id).orElse(null);
	}
}
