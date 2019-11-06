
package acme.entities.commercialBanners;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;

import org.hibernate.validator.constraints.CreditCardNumber;
import org.hibernate.validator.constraints.URL;

import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class CommercialBanner extends DomainEntity {

	private static final long	serialVersionUID	= 1L;

	@NotBlank
	private String				picture;

	@NotBlank
	private String				slogan;

	@URL
	private String				url;

	@NotBlank
	@CreditCardNumber
	private String				creditCard;
}
