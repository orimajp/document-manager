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
import org.springframework.stereotype.Component;

@Component
public class DocumentViewConvertor {

    GetDocumentListResponse createGetDocumentListResponse(GetDocumentListAppResponse getDocumentListAppResponse) {
        // TODO
        final GetDocumentListResponse getDocumentListResponse = new GetDocumentListResponse();
        return getDocumentListResponse;
    }

    GetDocumentDataResponse createGetDocumentDataResponse(GetDocumentDataAppResponse getDocumentDataAppResponse) {
        // TODO
        return new GetDocumentDataResponse();
    }

    GetDocumentSearchDataResponse createGetDocumentSearchDataResponse(GetDocumentSearchDataAppResponse getDocumentSearchDataAppResponse) {
        // TODO
        return new GetDocumentSearchDataResponse();
    }

    GetDocumentStructureResponse createGetDocumentStructureResponse(GetDocumentStructureAppResponse getDocumentStructureAppResponse) {
        // TODO
        return new GetDocumentStructureResponse();
    }

    GetDocumentPageDataResponse createGetPageDataResponse(GetDocumentPageDataAppResponse getDocumentPageDataAppResponse) {
        // TODO
        return new GetDocumentPageDataResponse();
    }

}
