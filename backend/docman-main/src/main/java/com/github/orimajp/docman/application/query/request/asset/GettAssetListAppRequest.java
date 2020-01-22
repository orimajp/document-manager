package com.github.orimajp.docman.application.query.request.asset;

import lombok.Builder;
import lombok.Getter;

/**
 * アセットリスト取得アプリケーションリクエストクラス
 */
@Getter
@Builder
public class GettAssetListAppRequest {

    // TODO 上二つのうちどちらかは必須とする?

    private String documentId;

    private String tempId;

    private Integer page; // TODO デフォルト値

    private Integer limit; // TODO デフォルト値

}
