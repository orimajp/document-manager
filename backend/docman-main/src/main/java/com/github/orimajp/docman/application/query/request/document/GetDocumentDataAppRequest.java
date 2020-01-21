package com.github.orimajp.docman.application.query.request.document;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * ドキュメントデータ取得アプリケーションリクエストクラス
 */
@Getter
@RequiredArgsConstructor(staticName = "of")
public class GetDocumentDataAppRequest {

    private final String documentId;

}
