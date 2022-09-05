package br.ufrn.residenciaimd.schedulemanager.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@AllArgsConstructor @NoArgsConstructor @EqualsAndHashCode
public class ScheduleTrialsPK implements Serializable {

    @Column(name = "schedule_id")
    @Getter private Long scheduleId;

    @Column(name = "trial_id")
    @Getter private Long trialId;
}
