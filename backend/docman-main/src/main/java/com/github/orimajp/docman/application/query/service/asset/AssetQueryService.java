package com.github.orimajp.docman.application.query.service.asset;

import com.github.orimajp.docman.application.query.request.asset.GetAssetDataAppRequest;
import com.github.orimajp.docman.application.query.request.asset.GettAssetListAppRequest;
import com.github.orimajp.docman.application.query.response.asset.GetAssetDataAppResponse;
import com.github.orimajp.docman.application.query.response.asset.GetAssetListAppResponse;

/**
 * アセットクエリサービスインタフェース
 */
public interface AssetQueryService {

    /**
     * アセットリスト取得
     *
     * @param request アセットリスト取得リクエスト
     * @return アセットリスト
     */
    GetAssetListAppResponse getAssetList(GettAssetListAppRequest request);

    /**
     * アセット取得
     *
     * @param request アセット取得リクエスト
     * @return アセット
     */
    GetAssetDataAppResponse getAsset(GetAssetDataAppRequest request);

}
