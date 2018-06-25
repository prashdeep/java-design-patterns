package com.classpath.creational.builder;

public class Laptop {

	private final int storage;
	private final String cpu;

	// optional attributes
	private  String osName = "WINDOWS_10";
	private  boolean msOfficeInstalled = false;
	private  boolean fingerPrintReaderRequired = false;
	private  boolean secondaryHardDriveRequired = false;
	private  boolean smartCardReaderInstalled = false;

	public Laptop(final int ram, final int storage, final String cpu) {
		this.storage = storage;
		this.cpu = cpu;
	}
	
	private Laptop(LaptopBuilder laptopBuilder) {
		this.storage = laptopBuilder.storage;
		this.cpu = laptopBuilder.cpu;
		this.osName = laptopBuilder.osName;
		this.fingerPrintReaderRequired = laptopBuilder.fingerPrintReaderRequired;
		this.secondaryHardDriveRequired = laptopBuilder.secondaryHardDriveRequired;
		this.smartCardReaderInstalled = laptopBuilder.secondaryHardDriveRequired;
		this.msOfficeInstalled = laptopBuilder.msOfficeRequired;
	}
	
	

	public int getStorage() {
		return storage;
	}

	public String getCpu() {
		return cpu;
	}

	public String getOsName() {
		return osName;
	}

	public boolean isMsOfficeInstalled() {
		return msOfficeInstalled;
	}

	public boolean isFingerPrintReaderRequired() {
		return fingerPrintReaderRequired;
	}

	public boolean isSecondaryHardDriveRequired() {
		return secondaryHardDriveRequired;
	}

	public boolean isSmartCardReaderInstalled() {
		return smartCardReaderInstalled;
	}



	public static class LaptopBuilder {

		private int ram;
		private int storage;
		private String cpu;

		// optional attributes
		private String osName = "WINDOWS_10";
		private boolean msOfficeRequired = false;
		private boolean fingerPrintReaderRequired = false;
		private boolean secondaryHardDriveRequired = false;
		private boolean smartCardReaderInstalled = false;
		


		public LaptopBuilder(int ram, int storage, String cpu) {
			this.ram = ram;
			this.storage = storage;
			this.cpu = cpu;
		}

		public LaptopBuilder installOS(String osName) {
			this.osName = osName;
			return this;
		}

		public LaptopBuilder msOfficeequired(boolean msOfficeRequired) {
			this.msOfficeRequired = msOfficeRequired;
			return this;
		}

		public LaptopBuilder fingerPrintReaderRequired(boolean fingerPrintReaderRequired) {
			this.fingerPrintReaderRequired = fingerPrintReaderRequired;
			return this;
		}

		public LaptopBuilder secondaryHardDriveRequired(boolean secondaryHardDriveRequired) {
			this.secondaryHardDriveRequired = secondaryHardDriveRequired;
			return this;
		}

		public LaptopBuilder smartCardReaderInstalled(boolean smartCardReaderInstalled) {
			this.smartCardReaderInstalled = smartCardReaderInstalled;
			return this;
		}
		
		public Laptop build() {
			return new Laptop(this);
		}

	}

}
