package com.example.mongodb.model;

import java.util.Date;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "HealthEvaluationForm")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class HealthEvaluation {
    @Id
    private String formCode;
    private Date date;
    private String formName;
    private boolean formCompleted;
    private boolean formApproved;
    private String companyName;

    private Integer attendance;
    private Integer toolBox;
    private Integer compliance;
    private Integer promotionalActivities;
    private Integer submission;
    private Integer score1;

    private Integer trainingCourse;
    private Integer tradeCourse;
    private Integer safetyTalk;
    private Integer WSHSupervisor;
    private Integer otherTraining;
    private Integer score2;

    private Integer effort;
    private Integer permitToWork;
    private Integer frequencyRate;
    private Integer safetyOffence;
    private Integer safetyRectification;
    private Integer score3;

    private Integer cuttingTool;
    private Integer ladder;
    private Integer liftingGear;
    private Integer electricalEquipment;
    private Integer otherMachineries;
    private Integer score4;

    private Integer commitmentHS;
    private Integer PPECompliance;
    private Integer siteCleanliness;
    private Integer storeCleanliness;
    private Integer quarterCleanliness;
    private Integer score5;

    private Integer overallScore;
    private String performanceStandard;
    private String comments;
    
    private String safetyCoordinator;
    private String safetyCoordinatorSignature;
    private Date safetyCoordinatorEvaluationDate;

    private String director;
    private String directorSignature;
    private Date directorApprovalDate;
}
