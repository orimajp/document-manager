package com.github.orimajp.docman.application.query.request.document;

import lombok.Builder;
import lombok.Getter;

/**
 * ドキュメントリストアプリケーションリクエストクラス
 */
@Getter
@Builder
public class GetDocumentListAppRequest {

    private String tempId;

    private Integer page; // TODO デフォルト値

    private Integer limit; // TODO デフォルト値

}
