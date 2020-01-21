package com.github.orimajp.docman.application.query.request.document;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * ページデータ取得アプリケーションリクエストクラス
 */
@Getter
@RequiredArgsConstructor(staticName = "of")
public class GetPageDataAppRequest {

    private final String documentId;

}
