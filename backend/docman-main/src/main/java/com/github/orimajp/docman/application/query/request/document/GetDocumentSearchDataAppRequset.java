package com.github.orimajp.docman.application.query.request.document;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * ドキュメント検索データ取得アプリケーションリクエストクラス
 */
@Getter
@RequiredArgsConstructor(staticName = "of")
public class GetDocumentSearchDataAppRequset {

    private final String documentId;

}
