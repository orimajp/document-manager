package com.github.orimajp.docman.application.query.service.document;

import com.github.orimajp.docman.application.query.request.document.GetDocumentDataAppRequest;
import com.github.orimajp.docman.application.query.request.document.GetDocumentStructureAppRequest;
import com.github.orimajp.docman.application.query.request.document.GetPageDataAppRequest;
import com.github.orimajp.docman.application.query.response.document.GetDocumentDataAppResponse;
import com.github.orimajp.docman.application.query.response.document.GetDocumentStructureAppResponse;
import com.github.orimajp.docman.application.query.response.document.GetPageDataAppResponse;

/**
 * ドキュメントクエリサービスインタフェース
 */
public interface DocumentQueryService {

    /**
     * ドキュメントデータ取得
     *
     * @param request ドキュメントデータ取得アプリケーションリクエスト
     * @return ドキュメントデータ
     */
    GetDocumentDataAppResponse getDocumentData(GetDocumentDataAppRequest request);

    /**
     * ページデータ取得
     *
     * @param request ページデータ取得アプリケーションリクエスト
     * @return ページデータ
     */
    GetPageDataAppResponse getPageData(GetPageDataAppRequest request);

    /**
     * ドキュメント構造取得
     *
     * @param request ドキュメント構造取得アプリケーションリクエスト
     * @return ドキュメント構造dokyumentokouzou
     */
    GetDocumentStructureAppResponse getDocumentStructure(GetDocumentStructureAppRequest request);

}
