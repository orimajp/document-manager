package com.github.orimajp.docman.presentation.view.controller.document;

import com.github.orimajp.docman.application.query.service.document.DocumentQueryService;
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
        return ResponseEntity.noContent().build();
    }

    // ページデータ取得
    @GetMapping("{documentId}/pages/{pageId}")
    public ResponseEntity<Object> getDocumentPageData(@PathVariable("documentId") String documentId,
            @PathVariable("pageId") String pageId) {
        return ResponseEntity.noContent().build();
    }

    // ドキュメントツリー取得
    @GetMapping("{documentId}/tree")
    public ResponseEntity<Object> getDocumentTree(@PathVariable("documentId") String documentId) {
        return ResponseEntity.noContent().build();
    }

    // 検索データ取得
    @GetMapping("{documentId}/searchdata")
    public ResponseEntity<Object> getDocumentSearchData(@PathVariable("documentId") String documentId) {
        return ResponseEntity.noContent().build();
    }

}
