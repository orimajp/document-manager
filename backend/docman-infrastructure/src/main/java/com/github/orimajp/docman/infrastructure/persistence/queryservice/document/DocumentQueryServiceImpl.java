package com.github.orimajp.docman.infrastructure.persistence.queryservice.document;

import com.github.orimajp.docman.application.query.request.document.GetDocumentDataAppRequest;
import com.github.orimajp.docman.application.query.request.document.GetDocumentSearchDataAppRequset;
import com.github.orimajp.docman.application.query.request.document.GetDocumentStructureAppRequest;
import com.github.orimajp.docman.application.query.request.document.GetPageDataAppRequest;
import com.github.orimajp.docman.application.query.response.document.GetDocumentDataAppResponse;
import com.github.orimajp.docman.application.query.response.document.GetDocumentSearchDataAppResponse;
import com.github.orimajp.docman.application.query.response.document.GetDocumentStructureAppResponse;
import com.github.orimajp.docman.application.query.response.document.GetPageDataAppResponse;
import com.github.orimajp.docman.application.query.service.document.DocumentQueryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * ドキュメントクエリサービスクラス
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class DocumentQueryServiceImpl implements DocumentQueryService {

    /**
     * ドキュメントデータ取得
     *
     * @param request ドキュメントデータ取得アプリケーションリクエスト
     * @return ドキュメントデータ
     */
    @Override
    public GetDocumentDataAppResponse getDocumentData(GetDocumentDataAppRequest request) {
        return null;
    }

    /**
     * ページデータ取得
     *
     * @param request ページデータ取得アプリケーションリクエスト
     * @return ページデータ
     */
    @Override
    public GetPageDataAppResponse getPageData(GetPageDataAppRequest request) {
        return null;
    }

    /**
     * ドキュメント構造取得
     *
     * @param request ドキュメント構造取得アプリケーションリクエスト
     * @return ドキュメント構造dokyumentokouzou
     */
    @Override
    public GetDocumentStructureAppResponse getDocumentStructure(GetDocumentStructureAppRequest request) {
        return null;
    }

    /**
     * ドキュメント検索データ取得
     *
     * @param requset ドキュメント検索データ取得アプリケーションリクエスト
     * @return ドキュメント検索データ
     */
    @Override
    public GetDocumentSearchDataAppResponse getDocumentSearchData(GetDocumentSearchDataAppRequset requset) {
        return null;
    }

}
