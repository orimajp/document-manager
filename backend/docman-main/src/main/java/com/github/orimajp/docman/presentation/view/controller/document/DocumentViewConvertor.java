package com.github.orimajp.docman.presentation.view.controller.document;

import com.github.orimajp.docman.application.query.response.document.GetDocumentDataAppResponse;
import com.github.orimajp.docman.application.query.response.document.GetDocumentListAppResponse;
import com.github.orimajp.docman.application.query.response.document.GetDocumentSearchDataAppResponse;
import com.github.orimajp.docman.application.query.response.document.GetDocumentStructureAppResponse;
import com.github.orimajp.docman.application.query.response.document.GetDocumentPageDataAppResponse;
import com.github.orimajp.docman.presentation.view.request.document.GetDocumentListResponse;
import com.github.orimajp.docman.presentation.view.response.document.GetDocumentDataResponse;
import com.github.orimajp.docman.presentation.view.response.document.GetDocumentSearchDataResponse;
import com.github.orimajp.docman.presentation.view.response.document.GetDocumentStructureResponse;
import com.github.orimajp.docman.presentation.view.response.document.GetDocumentPageDataResponse;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class DocumentViewConvertor {

    private final ModelMapper modelMapper;

    GetDocumentListResponse createGetDocumentListResponse(GetDocumentListAppResponse getDocumentListAppResponse) {
        return modelMapper.map(getDocumentListAppResponse, GetDocumentListResponse.class);
    }

    GetDocumentDataResponse createGetDocumentDataResponse(GetDocumentDataAppResponse getDocumentDataAppResponse) {
        return modelMapper.map(getDocumentDataAppResponse, GetDocumentDataResponse.class);
    }

    GetDocumentSearchDataResponse createGetDocumentSearchDataResponse(GetDocumentSearchDataAppResponse getDocumentSearchDataAppResponse) {
        return modelMapper.map(getDocumentSearchDataAppResponse, GetDocumentSearchDataResponse.class);
    }

    GetDocumentStructureResponse createGetDocumentStructureResponse(GetDocumentStructureAppResponse getDocumentStructureAppResponse) {
        return modelMapper.map(getDocumentStructureAppResponse, GetDocumentStructureResponse.class);
    }

    GetDocumentPageDataResponse createGetPageDataResponse(GetDocumentPageDataAppResponse getDocumentPageDataAppResponse) {
        return modelMapper.map(getDocumentPageDataAppResponse, GetDocumentPageDataResponse.class);
    }

}
