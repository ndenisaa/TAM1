package org.app.service.entities;
import javax.persistence.*;
@Entity 

public class Question {
		@Id
		private Integer questionId;
		private String description;
		private String wrightAnswer;
		@ManyToOne
		private Test test;
		public Integer getQuestionId() {
			return questionId;
		}
		public void setQuestionId(Integer questionId) {
			this.questionId = questionId;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public String getWrightAnswer() {
			return wrightAnswer;
		}
		public void setWrightAnswer(String wrightAnswer) {
			this.wrightAnswer = wrightAnswer;
		}
		public Test getTest() {
			return test;
		}
		public void setTest(Test test) {
			this.test = test;
		}
		public Question(Integer questionId, String description, String wrightAnswer, Test test) {
			super();
			this.questionId = questionId;
			this.description = description;
			this.wrightAnswer = wrightAnswer;
			this.test = test;
		}
		public Question() {
			super();
		}

}
