package com.github.orimajp.docman.application.query.request.asset;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * アセットデータ取得アプリケーションリクエストクラス
 */
@Getter
@RequiredArgsConstructor(staticName = "of")
public class GetAssetDataAppRequest {

    private final String assetId;

}
