package cdac.exam.b2.core;

import java.time.LocalDate;

public class Course {
	private static int idCounter =101;
	private int courseId;
	private String title;
	private double fees;
	private double discount;
	private LocalDate startDate;
	private LocalDate endDate;
	private Frequency freq;
	private Status status;
	private LocalDate updateDateTime;
	
	/**
	 * @param title
	 * @param fees
	 * @param discount
	 * @param startDate
	 * @param endDate
	 * @param freq
	 * @param status
	 * @param updateDateTime
	 */
	public Course(String title, double fees, double discount, LocalDate startDate, LocalDate endDate,
			Frequency freq, Status status, LocalDate updateDateTime) {
		super();
		this.courseId = idCounter++;
		this.title = title;
		this.fees = fees;
		this.discount = discount;
		this.startDate = startDate;
		this.endDate = endDate;
		this.freq = freq;
		this.status = status;
		this.updateDateTime = updateDateTime;
	}
	// Overrided toString Mehtod
	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", title=" + title + ", fees=" + fees + ", discount=" + discount
				+ ", startDate=" + startDate + ", endDate=" + endDate + ", freq=" + freq + ", status=" + status
				+ ", updateDateTime=" + updateDateTime + "]";
	}
	
	//Getters and Setters
	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}

	public Frequency getFreq() {
		return freq;
	}

	public void setFreq(Frequency freq) {
		this.freq = freq;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public LocalDate getUpdateDateTime() {
		return updateDateTime;
	}

	public void setUpdateDateTime(LocalDate updateDateTime) {
		this.updateDateTime = updateDateTime;
	}	
	
}
