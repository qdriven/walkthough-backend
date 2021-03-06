package io.qkits.fileservice.web.converter;

import io.qkits.fileservice.domain.FileUpload;
import io.qkits.fileservice.web.dto.FileUploadDTO;

import org.junit.Assert;
import org.junit.Test;

public class FileUploadConverterTest {
    @Test
    public void convert() {
        FileUpload fileUpload = new FileUpload();
        fileUpload.setId(123);
        fileUpload.setFilePath("filePath");
        FileUploadDTO fileUploadDTO = FileUploadConverter.convert(fileUpload);
        Assert.assertEquals(fileUploadDTO.getId(),new Integer(123));
        Assert.assertEquals(fileUploadDTO.getFilePath(),"filePath");
    }
}