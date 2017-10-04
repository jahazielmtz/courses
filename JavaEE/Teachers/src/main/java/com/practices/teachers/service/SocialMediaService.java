package com.practices.teachers.service;

import java.util.List;

import com.practices.teachers.model.SocialMedia;
import com.practices.teachers.model.TeacherSocialMedia;

public interface SocialMediaService {

	void saveSocialMedia(SocialMedia socialMedia);
	
	SocialMedia findSocialMediaById(Long idSocialMedia);
	
	List<SocialMedia> findAllSocialMedias();
	
	SocialMedia findSocialMediaByName(String name);
	
	TeacherSocialMedia findSocialMediaByIdAndNickname(Long idSocialMedia, String nickname);
	
	TeacherSocialMedia findSocialMediaByIdTeacherAndIdSocialMedia(Long idTeacher, Long idSocialMedia);
	
	void updateSocialMedia(SocialMedia socialMedia);
	
	void deleteSocialMedia(Long idSocialMedia);
	

}