package com.konfigthis.client;

import com.konfigthis.client.api.HrApi;
import com.konfigthis.client.api.PayrollApi;
import com.konfigthis.client.api.TokenRequestApi;

public class AdpWorkforceNow {
    private ApiClient apiClient;
    public final HrApi hr;
    public final PayrollApi payroll;
    public final TokenRequestApi tokenRequest;

    public AdpWorkforceNow() {
        this(null);
    }

    public AdpWorkforceNow(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.hr = new HrApi(this.apiClient);
        this.payroll = new PayrollApi(this.apiClient);
        this.tokenRequest = new TokenRequestApi(this.apiClient);
    }

}
