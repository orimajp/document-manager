package com.github.orimajp.docman.application.query.service.asset;

import com.github.orimajp.docman.application.query.request.asset.GetAssetDataAppRequest;
import com.github.orimajp.docman.application.query.response.asset.GetAssetDataAppResponse;

/**
 * アセットクエリサービスインタフェース
 */
public interface AssetQueryService {

    /**
     * アセット取得
     *
     * @param request アセット取得リクエスト
     * @return アセット
     */
    GetAssetDataAppResponse getAsset(GetAssetDataAppRequest request);

}
