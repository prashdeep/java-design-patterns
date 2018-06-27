package com.classpath.structural.adapter;

public class AccountAdapter extends AbstractAccount {

	// Adaptee - The class we are adapting from
	private OffshoreAccount offshoreAccount;

	/**
	 * 
	 * @param offshoreAccount
	 *            the instance of OffshoreAccount we are going to adapt from.
	 */
	public AccountAdapter(final OffshoreAccount offshoreAccount) {
		super(offshoreAccount.getOffshoreBalance());

		// holds adaptee reference
		this.offshoreAccount = offshoreAccount;
	}

	/**
	 * Calculate offshore account balance after deducting the tax owed for
	 * offshore account
	 */
	@Override
	public double getBalance() {
		final double taxRate = offshoreAccount.getTaxRate();
		final double grossBalance = offshoreAccount.getOffshoreBalance();

		final double taxableBalance = grossBalance * taxRate;
		final double balanceAfterTax = grossBalance - taxableBalance;
		return balanceAfterTax;
	}
}
