package com.github.orimajp.docman.infrastructure.persistence.queryservice.document;

import com.github.orimajp.docman.application.query.request.document.GetDocumentDataAppRequest;
import com.github.orimajp.docman.application.query.request.document.GetDocumentListAppRequest;
import com.github.orimajp.docman.application.query.request.document.GetDocumentSearchDataAppRequset;
import com.github.orimajp.docman.application.query.request.document.GetDocumentStructureAppRequest;
import com.github.orimajp.docman.application.query.request.document.GetPageDataAppRequest;
import com.github.orimajp.docman.application.query.response.document.GetDocumentDataAppResponse;
import com.github.orimajp.docman.application.query.response.document.GetDocumentListAppResponse;
import com.github.orimajp.docman.application.query.response.document.GetDocumentSearchDataAppResponse;
import com.github.orimajp.docman.application.query.response.document.GetDocumentStructureAppResponse;
import com.github.orimajp.docman.application.query.response.document.GetDocumentPageDataAppResponse;
import com.github.orimajp.docman.application.query.service.document.DocumentQueryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

/**
 * ドキュメントクエリサービスクラス
 */
@Slf4j
@Service
@RequiredArgsConstructor
public class DocumentQueryServiceImpl implements DocumentQueryService {

    /**
     * ドキュメントリスト取得
     *
     * @param request ドキュメントリストアプリケーションリクエストクラス
     * @return ドキュメントリスト
     */
    @Override
    public GetDocumentListAppResponse getDocumentList(GetDocumentListAppRequest request) {
        return null;
    }

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
    public GetDocumentPageDataAppResponse getPageData(GetPageDataAppRequest request) {
        final GetDocumentPageDataAppResponse response = new GetDocumentPageDataAppResponse();

        response.setPageKey("pagekey");
        response.setPageTitle("title");
        response.setPageData("data");
        response.setDocumentKey("dockey");
        response.setCreateDateTime(LocalDateTime.now());
        response.setCreateUserName("createuser");
        response.setUpdateDateTime(LocalDateTime.now());
        response.setUpdateUserName("updateuser");
        response.setRevision(1);
        response.setVersion(2);

        return response;
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
