package com.github.orimajp.docman.presentation.view.controller.asset;

import com.github.orimajp.docman.application.query.response.asset.GetAssetDataAppResponse;
import com.github.orimajp.docman.application.query.response.asset.GetAssetListAppResponse;
import com.github.orimajp.docman.presentation.view.response.asset.GetAssetDataResponse;
import com.github.orimajp.docman.presentation.view.response.asset.GetAssetListResponse;
import org.springframework.stereotype.Component;

@Component
public class AssetViewConvertor {

    GetAssetListResponse createGetAssetListResponse(GetAssetListAppResponse getAssetListAppResponse) {
        // TODO
        return new GetAssetListResponse();
    }

    GetAssetDataResponse createGetAssetDataResponse(GetAssetDataAppResponse getAssetDataAppResponse) {
        // TODO
        return new GetAssetDataResponse();
    }

}
