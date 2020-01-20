package com.github.orimajp.docman.presentation.view.controller.document;

import com.github.orimajp.docman.application.query.response.document.GetDocumentDataAppResponse;
import com.github.orimajp.docman.application.query.response.document.GetDocumentSearchDataAppResponse;
import com.github.orimajp.docman.application.query.response.document.GetDocumentStructureAppResponse;
import com.github.orimajp.docman.application.query.response.document.GetPageDataAppResponse;
import com.github.orimajp.docman.presentation.view.response.document.GetDocumentDataResponse;
import com.github.orimajp.docman.presentation.view.response.document.GetDocumentSearchDataResponse;
import com.github.orimajp.docman.presentation.view.response.document.GetDocumentStructureResponse;
import com.github.orimajp.docman.presentation.view.response.document.GetPageDataResponse;
import org.springframework.stereotype.Component;

@Component
public class DocumentViewConvertor {

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

    GetPageDataResponse createGetPageDataResponse(GetPageDataAppResponse getPageDataAppResponse) {
        // TODO
        return new GetPageDataResponse();
    }

}
