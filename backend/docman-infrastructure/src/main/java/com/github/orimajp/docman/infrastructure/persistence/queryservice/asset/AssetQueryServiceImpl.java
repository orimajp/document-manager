package com.github.orimajp.docman.infrastructure.persistence.queryservice.asset;

import com.github.orimajp.docman.application.query.request.asset.GetAssetDataAppRequest;
import com.github.orimajp.docman.application.query.request.asset.GettAssetListAppRequest;
import com.github.orimajp.docman.application.query.response.asset.GetAssetDataAppResponse;
import com.github.orimajp.docman.application.query.response.asset.GetAssetListAppResponse;
import com.github.orimajp.docman.application.query.service.asset.AssetQueryService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class AssetQueryServiceImpl implements AssetQueryService {

    /**
     * アセットリスト取得
     *
     * @param request アセットリスト取得リクエスト
     * @return アセットリスト
     */
    @Override
    public GetAssetListAppResponse getAssetList(GettAssetListAppRequest request) {
        return null;
    }

    /**
     * アセット取得
     *
     * @param request アセット取得リクエスト
     * @return アセット
     */
    @Override
    public GetAssetDataAppResponse getAsset(GetAssetDataAppRequest request) {
        return null;
    }

}
