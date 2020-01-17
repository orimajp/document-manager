package com.github.orimajp.docman.application.query.response.asset;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

/**
 * アセットデータ取得アプリケーションレスポンスクラス
 */
@Getter
@RequiredArgsConstructor
public class GetAssetDataAppResponse {

    /** アセット名 */
    private final String assetName;

    /** アセットデータ */
    private final byte[] assetData;

    /** Content Type */
    private final String contentType; // TODO enumとかにした方がいい?

    /** アセット更新日時 */
    private final LocalDateTime assetUpdateDateTime;


}
