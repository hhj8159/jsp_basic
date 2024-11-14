package vo;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Reply {
	private Long rno;
	private String content;
	private Date regdate;
	private Date updatedate;
	private boolean hidden;
	private int likes;
	private String writer;
	private Long pno;
	
//	Li
//	
//	public Reply(Long rno, String content, Date regdate, Date updatedate, int hidden, int likes, String writer, Long pno) {
//		this.rno = rno;
//		this.content = content;
//		this.regdate = regdate;
//		this.updatedate = updatedate;
//		this.hidden = hidden;
//		this.likes = likes;
//		this.writer = writer;
//		this.pno = pno;
//	}
	
}
