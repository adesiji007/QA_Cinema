package com.qacinema.project;

public class Movies {
	private String movies_Id;
	private String movies_Title;
	private String movies_Detail;
	private String movies_Duration;
	private String movies_Time;

	public Movies(String movies_Id, String movies_Title, String movies_Detail, String movies_Duration,
			String movies_Time) {
		super();
		this.movies_Id = movies_Id;
		this.movies_Title = movies_Title;
		this.movies_Detail = movies_Detail;
		this.movies_Duration = movies_Duration;
		this.movies_Time = movies_Time;
	}

	public String getMovies_Id() {
		return movies_Id;
	}

	public void setMovies_Id(String movies_Id) {
		this.movies_Id = movies_Id;
	}

	public String getMovies_Title() {
		return movies_Title;
	}

	public void setMovies_Title(String movies_Title) {
		this.movies_Title = movies_Title;
	}

	public String getMovies_Detail() {
		return movies_Detail;
	}

	public void setMovies_Detail(String movies_Detail) {
		this.movies_Detail = movies_Detail;
	}

	public String getMovies_Duration() {
		return movies_Duration;
	}

	public void setMovies_Duration(String movies_Duration) {
		this.movies_Duration = movies_Duration;
	}

	public String getMovies_Time() {
		return movies_Time;
	}

	public void setMovies_Time(String movies_Time) {
		this.movies_Time = movies_Time;
	}
@Override
	public String toString(){
	return "Movies Title : " + this.movies_Title + " "+ this.movies_Id + " " + this.movies_Detail + " " + this.movies_Duration + " " + this.movies_Time ;
}
}
