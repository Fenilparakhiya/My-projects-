package org.fenil.photo.Gallery.album.api.payload.auth;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class ProfileDTO {

    private long id;
    private String email;
    private String authorities;
    
}
