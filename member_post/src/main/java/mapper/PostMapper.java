package mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import dto.Criteria;
import vo.Post;

public interface PostMapper {
//	List<Post> selectList();
//	
//	Post selectOne(Long pno);
//	
//	@Select("select now()")
//	String now();
//	
//	int write(Post post);
	
	int insert(Post post);
	
	Post selectOne(Long pno);
	
	int getCount(Criteria cri);
	
	List<Post> selectList(Criteria cri);
	
	int update (Post post);
	
	int increaseViewCount(Long pno);
	
	int delete (Long pno);
}
