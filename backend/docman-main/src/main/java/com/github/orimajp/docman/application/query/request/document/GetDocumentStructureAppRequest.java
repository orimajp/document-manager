package com.github.orimajp.docman.application.query.request.document;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * 文書構造取得アプリケーションリクエストクラス
 */
@Getter
@RequiredArgsConstructor(staticName = "of")
public class GetDocumentStructureAppRequest {

    private final String documentId;

}
