package chuongnh.hcm.Service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import chuongnh.hcm.DAO.PostRepository;
import chuongnh.hcm.Model.Post;

@Service
@Transactional
public class PostSerrvice {
	private final PostRepository postRepository;

	public PostSerrvice(PostRepository postRepository) {
		this.postRepository = postRepository;
	}

	public List<Post> findAll() {
		List<Post> tasks = new ArrayList<>();
		for (Post task : postRepository.findAll()) {
			tasks.add(task);
		}
		return tasks;
	}

	public Post findTask(int id) {
		return postRepository.findOne(id);
	}

	public void save(Post post) {
		postRepository.save(post);
	}

	public void delete(int id) {
		postRepository.delete(id);
	}
}
