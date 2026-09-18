package com.api.blog.mapper;

import com.api.blog.dto.request.PostRequestDto;
import com.api.blog.dto.response.PostResponseDto;
import com.api.blog.model.PostModel;
import org.springframework.stereotype.Component;

@Component
public class PostMapper {

    public PostModel toEntity(PostRequestDto dto) {
        if (dto == null) {
            return null;
        }
        return new PostModel(
            dto.autor(),
            dto.titulo(),
            dto.texto()
        );
    }

    public PostResponseDto toDto(PostModel entity) {
        if (entity == null) {
            return null;
        }
        return new PostResponseDto(
            entity.getId(),
            entity.getAutor(),
            entity.getData(),
            entity.getTitulo(),
            entity.getTexto()
        );
    }

    public void updateEntityFromDto(PostRequestDto dto, PostModel entity) {
        if (dto == null || entity == null) {
            return;
        }
        entity.setAutor(dto.autor());
        entity.setTitulo(dto.titulo());
        entity.setTexto(dto.texto());
    }
}
