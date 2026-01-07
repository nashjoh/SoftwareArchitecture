/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Referral;
import model.ReferralManager;

import java.util.List;

public class ReferralController {

    private ReferralManager referralManager;

    public ReferralController() {
        referralManager = ReferralManager.getInstance();
    }

    public Referral createReferral(String fromClinicianId,
                                   String patientId,
                                   String toClinicianId,
                                   String referringFacilityId,
                                   String referredToFacilityId,
                                   String urgency,
                                   String reason,
                                   String clinicalSummary,
                                   String investigations) {

        return referralManager.createReferral(
                fromClinicianId,
                patientId,
                toClinicianId,
                referringFacilityId,
                referredToFacilityId,
                urgency,
                reason,
                clinicalSummary,
                investigations
        );
    }

    public List<Referral> getAllReferrals() {
        return referralManager.getAllReferrals();
    }
}
