package com.github.orimajp.docman.application.query.service.document;

import com.github.orimajp.docman.application.query.request.document.GetDocumentDataAppRequest;
import com.github.orimajp.docman.application.query.request.document.GetDocumentListAppRequest;
import com.github.orimajp.docman.application.query.request.document.GetDocumentSearchDataAppRequset;
import com.github.orimajp.docman.application.query.request.document.GetDocumentStructureAppRequest;
import com.github.orimajp.docman.application.query.request.document.GetPageDataAppRequest;
import com.github.orimajp.docman.application.query.response.document.GetDocumentDataAppResponse;
import com.github.orimajp.docman.application.query.response.document.GetDocumentListAppResponse;
import com.github.orimajp.docman.application.query.response.document.GetDocumentSearchDataAppResponse;
import com.github.orimajp.docman.application.query.response.document.GetDocumentStructureAppResponse;
import com.github.orimajp.docman.application.query.response.document.GetPageDataAppResponse;

/**
 * ドキュメントクエリサービスインタフェース
 */
public interface DocumentQueryService {

    /**
     * ドキュメントリスト取得
     *
     * @param request ドキュメントリストアプリケーションリクエストクラス
     * @return ドキュメントリスト
     */
    GetDocumentListAppResponse getDocumentList(GetDocumentListAppRequest request);

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

    /**
     * ドキュメント検索データ取得
     *
     * @param requset ドキュメント検索データ取得アプリケーションリクエスト
     * @return ドキュメント検索データ
     */
    GetDocumentSearchDataAppResponse getDocumentSearchData(GetDocumentSearchDataAppRequset requset);

}
