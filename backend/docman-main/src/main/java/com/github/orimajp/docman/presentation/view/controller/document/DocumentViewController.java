package com.github.orimajp.docman.presentation.view.controller.document;

import com.github.orimajp.docman.application.query.request.document.GetDocumentDataAppRequest;
import com.github.orimajp.docman.application.query.request.document.GetDocumentSearchDataAppRequset;
import com.github.orimajp.docman.application.query.request.document.GetDocumentStructureAppRequest;
import com.github.orimajp.docman.application.query.request.document.GetPageDataAppRequest;
import com.github.orimajp.docman.application.query.response.document.GetDocumentDataAppResponse;
import com.github.orimajp.docman.application.query.response.document.GetDocumentSearchDataAppResponse;
import com.github.orimajp.docman.application.query.response.document.GetDocumentStructureAppResponse;
import com.github.orimajp.docman.application.query.response.document.GetPageDataAppResponse;
import com.github.orimajp.docman.application.query.service.document.DocumentQueryService;
import com.github.orimajp.docman.presentation.view.response.document.GetDocumentDataResponse;
import com.github.orimajp.docman.presentation.view.response.document.GetDocumentSearchDataResponse;
import com.github.orimajp.docman.presentation.view.response.document.GetDocumentStructureResponse;
import com.github.orimajp.docman.presentation.view.response.document.GetPageDataResponse;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * ドキュメント表示コントローラ
 */
@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("v1/view/documents")
public class DocumentViewController {

    private final DocumentQueryService documentQueryService;

    private final DocumentViewConvertor documentViewConvertor;

    // 単独ドキュメント
    // 単ページ
    // ページツリー
    // 検索データ



    // ドキュメントリスト
    @GetMapping
    public ResponseEntity<Object> getDocumentList(@RequestParam("teamId") String teamId,
            @RequestParam("page") Integer page, @RequestParam("limit") Integer limit) {
        return ResponseEntity.noContent().build();
    }

    // ドキュメントデータ取得
    @GetMapping("{documentId}")
    public ResponseEntity<Object> getDocumentData(@PathVariable("documentId") String documentId) {
        final GetDocumentDataAppRequest getDocumentDataAppRequest = GetDocumentDataAppRequest.of(documentId);
        final GetDocumentDataAppResponse getDocumentDataAppResponse = documentQueryService.getDocumentData(getDocumentDataAppRequest);
        final GetDocumentDataResponse getDocumentDataResponse = documentViewConvertor.createGetDocumentDataResponse(getDocumentDataAppResponse);

        return ResponseEntity.ok(getDocumentDataResponse);
    }

    // ページデータ取得
    @GetMapping("{documentId}/pages/{pageId}")
    public ResponseEntity<Object> getDocumentPageData(@PathVariable("documentId") String documentId,
            @PathVariable("pageId") String pageId) {

        final GetPageDataAppRequest getPageDataAppRequest = GetPageDataAppRequest.of(documentId);
        final GetPageDataAppResponse getPageDataAppResponse = documentQueryService.getPageData(getPageDataAppRequest);
        final GetPageDataResponse getPageDataResponse = documentViewConvertor.createGetPageDataResponse(getPageDataAppResponse);

        return ResponseEntity.ok(getPageDataResponse);
    }

    // ドキュメントツリー取得
    @GetMapping("{documentId}/tree")
    public ResponseEntity<Object> getDocumentTree(@PathVariable("documentId") String documentId) {

        final GetDocumentStructureAppRequest getDocumentStructureAppRequest = GetDocumentStructureAppRequest.of(documentId);
        final GetDocumentStructureAppResponse getDocumentStructureAppResponse = documentQueryService.getDocumentStructure(getDocumentStructureAppRequest);
        final GetDocumentStructureResponse getDocumentStructureResponse = documentViewConvertor.createGetDocumentStructureResponse(getDocumentStructureAppResponse);

        return ResponseEntity.ok(getDocumentStructureResponse);
    }

    // 検索データ取得
    @GetMapping("{documentId}/searchdata")
    public ResponseEntity<Object> getDocumentSearchData(@PathVariable("documentId") String documentId) {

        final GetDocumentSearchDataAppRequset getDocumentSearchDataAppRequset = GetDocumentSearchDataAppRequset.of(documentId);
        final GetDocumentSearchDataAppResponse getDocumentSearchDataAppResponse = documentQueryService.getDocumentSearchData(getDocumentSearchDataAppRequset);
        final GetDocumentSearchDataResponse getDocumentSearchDataResponse = documentViewConvertor.createGetDocumentSearchDataResponse(getDocumentSearchDataAppResponse);

        return ResponseEntity.ok(getDocumentSearchDataResponse);
    }

}
