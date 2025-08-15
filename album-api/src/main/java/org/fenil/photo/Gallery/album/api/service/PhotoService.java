package org.fenil.photo.Gallery.album.api.service;

import java.util.List;
import java.util.Optional;

import org.fenil.photo.Gallery.album.api.model.Photo;
import org.fenil.photo.Gallery.album.api.repository.PhotoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PhotoService {

    @Autowired
    private PhotoRepository photoRepository;

    public Photo save(Photo photo){
        return photoRepository.save(photo);
    }

    public Optional<Photo> findById(long id){
        return photoRepository.findById(id);
    }
    
    public void delete(Photo photo){
        photoRepository.delete(photo);
    }

    public List<Photo> findByAlbumId(long id){
        return photoRepository.findByAlbum_id(id);
    }
}
