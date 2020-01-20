package com.github.orimajp.docman.presentation.view.controller.site;

import com.github.orimajp.docman.application.query.response.site.GetSiteInformationAppResponse;
import com.github.orimajp.docman.presentation.view.response.site.GetSiteInformationResponse;
import org.springframework.stereotype.Component;

@Component
public class SiteViewConvertor {

    GetSiteInformationResponse createGetSiteInformationResponse(GetSiteInformationAppResponse getSiteInformationAppResponse) {
        // TODO
        return new GetSiteInformationResponse();
    }

}
