package com.bolsadeideas.springboot.backend.apirest.models.services;

import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Path;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

public class UploadFileServiceImpl implements IUploadFileService {

    @Override
    public Resource cargar(String nombreFoto) throws MalformedURLException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String copiar(MultipartFile archivo) throws IOException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean eliminar(String nombreFoto) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Path getPath(String nombreFoto) {
        // TODO Auto-generated method stub
        return null;
    }

}
