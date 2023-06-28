release 'MFS - Release', {
  description = ''
  disableMultipleActiveRuns = '0'
  plannedEndDate = '2023-06-30T14:03'
  plannedStartDate = '2023-06-16T14:03'
  projectName = 'MFS'
  timeZone = null

  pipeline 'pipeline_MFS - Release', {
    description = ''
    disableMultipleActiveRuns = '0'
    disableRestart = '0'
    enabled = '1'
    overrideWorkspace = '0'
    pipelineRunNameTemplate = null
    releaseName = 'MFS - Release'
    skipStageMode = 'ENABLED'
    templatePipelineName = null
    templatePipelineProjectName = null
    type = null
    workspaceName = null

    formalParameter 'ec_stagesToRun', defaultValue: null, {
      description = ''
      expansionDeferred = '1'
      label = null
      orderIndex = null
      required = '0'
      type = null
    }

    stage 'Release Readiness', {
      description = ''
      colorCode = '#289ce1'
      completionType = 'auto'
      condition = null
      duration = null
      parallelToPrevious = null
      pipelineName = 'pipeline_MFS - Release'
      plannedEndDate = null
      plannedStartDate = null
      precondition = null
      resourceName = null
      waitForPlannedStartDate = '0'

      gate 'PRE', {
        description = ''
        condition = null
        precondition = null
        }

      gate 'POST', {
        description = ''
        condition = null
        precondition = null
        task 'Code Coverage > 75', {
          description = ''
          actionLabelText = null
          advancedMode = '0'
          afterLastRetry = null
          allowOutOfOrderRun = '0'
          allowSkip = null
          alwaysRun = '0'
          applicationName = null
          applicationProjectName = null
          applicationVersion = null
          artifacts = null
          artifactsRegEx = null
          ciConfigurationName = null
          ciControllerFolder = null
          ciControllerName = null
          ciEndpoint = null
          ciJobBranchName = null
          ciJobFolder = null
          ciJobName = null
          command = null
          condition = null
          customLabel = null
          deployerExpression = null
          deployerRunType = null
          disableFailure = null
          duration = null
          emailConfigName = null
          enabled = '1'
          environmentName = null
          environmentProjectName = null
          environmentTemplateName = null
          environmentTemplateProjectName = null
          errorHandling = 'stopOnError'
          gateCondition = '''$[/javascript
		//myStageRuntime.tasks[\'Run Code Quality and Security Scan\'].job.getLastSonarMetrics.coverage]	> 75	]'''
          gateType = 'POST'
          groupName = null
          groupRunType = null
          insertRollingDeployManualStep = '0'
          instruction = null
          notificationEnabled = null
          notificationTemplate = null
          parallelToPrevious = null
          plannedEndDate = null
          plannedStartDate = null
          postp = null
          precondition = null
          requiredApprovalsCount = null
          resourceName = ''
          retryCount = null
          retryInterval = null
          retryType = null
          rollingDeployEnabled = null
          rollingDeployManualStepCondition = null
          rolloutNotificationEnabled = null
          shell = null
          skippable = '0'
          snapshotName = null
          stageSummaryParameters = null
          startingStage = null
          subErrorHandling = null
          subTaskType = null
          subapplication = null
          subpipeline = null
          subpluginKey = null
          subprocedure = null
          subprocess = null
          subproject = 'MFS'
          subrelease = null
          subreleasePipeline = null
          subreleasePipelineProject = null
          subreleaseSuffix = null
          subworkflowDefinition = null
          subworkflowStartingState = null
          taskProcessType = null
          taskType = 'CONDITIONAL'
          triggerType = null
          useApproverAcl = '0'
          waitForPlannedStartDate = '0'
        }

        task 'Check for Approval Please', {
          description = ''
          actionLabelText = null
          advancedMode = '0'
          afterLastRetry = null
          allowOutOfOrderRun = '0'
          allowSkip = '0'
          alwaysRun = '0'
          applicationName = null
          applicationProjectName = null
          applicationVersion = null
          artifacts = null
          artifactsRegEx = null
          ciConfigurationName = null
          ciControllerFolder = null
          ciControllerName = null
          ciEndpoint = null
          ciJobBranchName = null
          ciJobFolder = null
          ciJobName = null
          command = null
          condition = null
          customLabel = null
          deployerExpression = null
          deployerRunType = null
          disableFailure = null
          duration = null
          emailConfigName = null
          enabled = '1'
          environmentName = null
          environmentProjectName = null
          environmentTemplateName = null
          environmentTemplateProjectName = null
          errorHandling = 'stopOnError'
          gateCondition = null
          gateType = 'POST'
          groupName = null
          groupRunType = null
          insertRollingDeployManualStep = '0'
          instruction = null
          notificationEnabled = '0'
          notificationTemplate = 'ec_default_gate_task_notification_template'
          parallelToPrevious = null
          plannedEndDate = null
          plannedStartDate = null
          postp = null
          precondition = null
          requiredApprovalsCount = null
          resourceName = ''
          retryCount = null
          retryInterval = null
          retryType = null
          rollingDeployEnabled = null
          rollingDeployManualStepCondition = null
          rolloutNotificationEnabled = null
          shell = null
          skippable = '0'
          snapshotName = null
          stageSummaryParameters = null
          startingStage = null
          subErrorHandling = null
          subTaskType = null
          subapplication = null
          subpipeline = null
          subpluginKey = null
          subprocedure = null
          subprocess = null
          subproject = 'MFS'
          subrelease = null
          subreleasePipeline = null
          subreleasePipelineProject = null
          subreleaseSuffix = null
          subworkflowDefinition = null
          subworkflowStartingState = null
          taskProcessType = null
          taskType = 'APPROVAL'
          triggerType = null
          useApproverAcl = '0'
          waitForPlannedStartDate = '0'
          approver = [
            'admin',
          ]
        }
      }

      task 'Get Release Dependencies', {
        description = ''
        actionLabelText = null
        actualParameter = [
          'depPropPath': '/myPipelineRuntime',
          'jsonFilePath': '/tmp/release.json',
          'startingpath': '/myJob/loadedPropertySheet',
        ]
        advancedMode = '0'
        afterLastRetry = null
        allowOutOfOrderRun = '0'
        allowSkip = null
        alwaysRun = '0'
        applicationName = null
        applicationProjectName = null
        applicationVersion = null
        artifacts = null
        artifactsRegEx = null
        ciConfigurationName = null
        ciControllerFolder = null
        ciControllerName = null
        ciEndpoint = null
        ciJobBranchName = null
        ciJobFolder = null
        ciJobName = null
        command = null
        condition = null
        customLabel = null
        deployerExpression = null
        deployerRunType = null
        disableFailure = null
        duration = null
        emailConfigName = null
        enabled = '1'
        environmentName = null
        environmentProjectName = null
        environmentTemplateName = null
        environmentTemplateProjectName = null
        errorHandling = 'stopOnError'
        gateCondition = null
        gateType = null
        groupName = null
        groupRunType = null
        insertRollingDeployManualStep = '0'
        instruction = null
        notificationEnabled = null
        notificationTemplate = null
        parallelToPrevious = null
        plannedEndDate = null
        plannedStartDate = null
        postp = null
        precondition = null
        requiredApprovalsCount = null
        resourceName = ''
        retryCount = null
        retryInterval = null
        retryType = null
        rollingDeployEnabled = null
        rollingDeployManualStepCondition = null
        rolloutNotificationEnabled = null
        shell = null
        skippable = '0'
        snapshotName = null
        stageSummaryParameters = null
        startingStage = null
        subErrorHandling = null
        subTaskType = null
        subapplication = null
        subpipeline = null
        subpluginKey = null
        subprocedure = 'JSON file to properties'
        subprocess = null
        subproject = 'MFS'
        subrelease = null
        subreleasePipeline = null
        subreleasePipelineProject = null
        subreleaseSuffix = null
        subworkflowDefinition = null
        subworkflowStartingState = null
        taskProcessType = null
        taskType = 'PROCEDURE'
        triggerType = null
        useApproverAcl = '0'
        waitForPlannedStartDate = '0'
      }

      task 'Get Sonar Scan Results', {
        description = ''
        actionLabelText = null
        actualParameter = [
          'config': '/projects/Default/pluginConfigurations/sonar',
          'resultFormat': 'propertysheet',
          'resultSonarProperty': '/myJob/getLastSonarMetrics',
          'sonarMetricsComplexity': 'all',
          'sonarMetricsDocumentation': 'all',
          'sonarMetricsDuplications': 'all',
          'sonarMetricsIssues': 'all',
          'sonarMetricsMaintainability': 'all',
          'sonarMetricsMetrics': 'all',
          'sonarMetricsQualityGates': 'all',
          'sonarMetricsReliability': 'all',
          'sonarMetricsSecurity': 'all',
          'sonarMetricsTests': 'all',
          'sonarProjectKey': 'petclinic',
          'sonarProjectName': 'petclinic',
          'sonarProjectVersion': '2.2.0.BUILD-SNAPSHOT',
          'sonarTaskId': '',
          'sonarTimeout': '',
        ]
        advancedMode = '0'
        afterLastRetry = null
        allowOutOfOrderRun = '0'
        allowSkip = null
        alwaysRun = '0'
        applicationName = null
        applicationProjectName = null
        applicationVersion = null
        artifacts = null
        artifactsRegEx = null
        ciConfigurationName = null
        ciControllerFolder = null
        ciControllerName = null
        ciEndpoint = null
        ciJobBranchName = null
        ciJobFolder = null
        ciJobName = null
        command = null
        condition = null
        customLabel = null
        deployerExpression = null
        deployerRunType = null
        disableFailure = null
        duration = null
        emailConfigName = null
        enabled = '1'
        environmentName = null
        environmentProjectName = null
        environmentTemplateName = null
        environmentTemplateProjectName = null
        errorHandling = 'stopOnError'
        gateCondition = null
        gateType = null
        groupName = null
        groupRunType = null
        insertRollingDeployManualStep = '0'
        instruction = null
        notificationEnabled = null
        notificationTemplate = null
        parallelToPrevious = null
        plannedEndDate = null
        plannedStartDate = null
        postp = null
        precondition = null
        requiredApprovalsCount = null
        resourceName = ''
        retryCount = null
        retryInterval = null
        retryType = null
        rollingDeployEnabled = null
        rollingDeployManualStepCondition = null
        rolloutNotificationEnabled = null
        shell = null
        skippable = '0'
        snapshotName = null
        stageSummaryParameters = null
        startingStage = null
        subErrorHandling = null
        subTaskType = null
        subapplication = null
        subpipeline = null
        subpluginKey = 'EC-SonarQube'
        subprocedure = 'Get Last SonarQube Metrics'
        subprocess = null
        subproject = null
        subrelease = null
        subreleasePipeline = null
        subreleasePipelineProject = null
        subreleaseSuffix = null
        subworkflowDefinition = null
        subworkflowStartingState = null
        taskProcessType = null
        taskType = 'PLUGIN'
        triggerType = null
        useApproverAcl = '0'
        waitForPlannedStartDate = '0'
      }

      task 'Get Nexus-IQ Results', {
        description = ''
        actionLabelText = null
        advancedMode = '0'
        afterLastRetry = null
        allowOutOfOrderRun = '0'
        allowSkip = null
        alwaysRun = '0'
        applicationName = null
        applicationProjectName = null
        applicationVersion = null
        artifacts = null
        artifactsRegEx = null
        ciConfigurationName = null
        ciControllerFolder = null
        ciControllerName = null
        ciEndpoint = null
        ciJobBranchName = null
        ciJobFolder = null
        ciJobName = null
        command = null
        condition = null
        customLabel = null
        deployerExpression = null
        deployerRunType = null
        disableFailure = null
        duration = null
        emailConfigName = null
        enabled = '0'
        environmentName = null
        environmentProjectName = null
        environmentTemplateName = null
        environmentTemplateProjectName = null
        errorHandling = 'stopOnError'
        gateCondition = null
        gateType = null
        groupName = null
        groupRunType = null
        insertRollingDeployManualStep = '0'
        instruction = null
        notificationEnabled = null
        notificationTemplate = null
        parallelToPrevious = null
        plannedEndDate = null
        plannedStartDate = null
        postp = null
        precondition = null
        requiredApprovalsCount = null
        resourceName = null
        retryCount = null
        retryInterval = null
        retryType = null
        rollingDeployEnabled = null
        rollingDeployManualStepCondition = null
        rolloutNotificationEnabled = null
        shell = null
        skippable = '0'
        snapshotName = null
        stageSummaryParameters = null
        startingStage = null
        subErrorHandling = null
        subTaskType = null
        subapplication = null
        subpipeline = null
        subpluginKey = null
        subprocedure = null
        subprocess = null
        subproject = 'MFS'
        subrelease = null
        subreleasePipeline = null
        subreleasePipelineProject = null
        subreleaseSuffix = null
        subworkflowDefinition = null
        subworkflowStartingState = null
        taskProcessType = null
        taskType = null
        triggerType = null
        useApproverAcl = '0'
        waitForPlannedStartDate = '0'
      }

      task 'Get Helix ITSM Change Ticket', {
        description = ''
        actionLabelText = null
        advancedMode = '0'
        afterLastRetry = null
        allowOutOfOrderRun = '0'
        allowSkip = null
        alwaysRun = '0'
        applicationName = null
        applicationProjectName = null
        applicationVersion = null
        artifacts = null
        artifactsRegEx = null
        ciConfigurationName = null
        ciControllerFolder = null
        ciControllerName = null
        ciEndpoint = null
        ciJobBranchName = null
        ciJobFolder = null
        ciJobName = null
        command = null
        condition = null
        customLabel = null
        deployerExpression = null
        deployerRunType = null
        disableFailure = null
        duration = null
        emailConfigName = null
        enabled = '0'
        environmentName = null
        environmentProjectName = null
        environmentTemplateName = null
        environmentTemplateProjectName = null
        errorHandling = 'stopOnError'
        gateCondition = null
        gateType = null
        groupName = null
        groupRunType = null
        insertRollingDeployManualStep = '0'
        instruction = null
        notificationEnabled = null
        notificationTemplate = null
        parallelToPrevious = null
        plannedEndDate = null
        plannedStartDate = null
        postp = null
        precondition = null
        requiredApprovalsCount = null
        resourceName = null
        retryCount = null
        retryInterval = null
        retryType = null
        rollingDeployEnabled = null
        rollingDeployManualStepCondition = null
        rolloutNotificationEnabled = null
        shell = null
        skippable = '0'
        snapshotName = null
        stageSummaryParameters = null
        startingStage = null
        subErrorHandling = null
        subTaskType = null
        subapplication = null
        subpipeline = null
        subpluginKey = null
        subprocedure = null
        subprocess = null
        subproject = 'MFS'
        subrelease = null
        subreleasePipeline = null
        subreleasePipelineProject = null
        subreleaseSuffix = null
        subworkflowDefinition = null
        subworkflowStartingState = null
        taskProcessType = null
        taskType = null
        triggerType = null
        useApproverAcl = '0'
        waitForPlannedStartDate = '0'
      }
    }

    stage 'Release', {
      description = ''
      colorCode = '#06b732'
      completionType = 'auto'
      condition = null
      duration = null
      parallelToPrevious = null
      pipelineName = 'pipeline_MFS - Release'
      plannedEndDate = null
      plannedStartDate = null
      precondition = null
      resourceName = null
      waitForPlannedStartDate = '0'

      gate 'PRE', {
        description = ''
        condition = null
        precondition = null
        }

      gate 'POST', {
        description = ''
        condition = null
        precondition = null
        }

      task 'Deploy Microservice A', {
        description = ''
        actionLabelText = null
        actualParameter = [
          'APP_NAME': 'microserviceA',
        ]
        advancedMode = '0'
        afterLastRetry = null
        allowOutOfOrderRun = '0'
        allowSkip = null
        alwaysRun = '0'
        applicationName = null
        applicationProjectName = null
        applicationVersion = null
        artifacts = null
        artifactsRegEx = null
        ciConfigurationName = 'ikurtz-cbdemos-thunder'
        ciControllerFolder = null
        ciControllerName = null
        ciEndpoint = null
        ciJobBranchName = null
        ciJobFolder = '/'
        ciJobName = 'deploy-microservice'
        command = null
        condition = null
        customLabel = null
        deployerExpression = null
        deployerRunType = null
        disableFailure = null
        duration = null
        emailConfigName = null
        enabled = '1'
        environmentName = null
        environmentProjectName = null
        environmentTemplateName = null
        environmentTemplateProjectName = null
        errorHandling = 'stopOnError'
        gateCondition = null
        gateType = null
        groupName = null
        groupRunType = null
        insertRollingDeployManualStep = '0'
        instruction = null
        notificationEnabled = null
        notificationTemplate = null
        parallelToPrevious = null
        plannedEndDate = null
        plannedStartDate = null
        postp = null
        precondition = null
        requiredApprovalsCount = null
        resourceName = ''
        retryCount = null
        retryInterval = null
        retryType = null
        rollingDeployEnabled = null
        rollingDeployManualStepCondition = null
        rolloutNotificationEnabled = null
        shell = null
        skippable = '0'
        snapshotName = null
        stageSummaryParameters = null
        startingStage = null
        subErrorHandling = null
        subTaskType = null
        subapplication = null
        subpipeline = null
        subpluginKey = null
        subprocedure = null
        subprocess = null
        subproject = 'MFS'
        subrelease = null
        subreleasePipeline = null
        subreleasePipelineProject = null
        subreleaseSuffix = null
        subworkflowDefinition = null
        subworkflowStartingState = null
        taskProcessType = null
        taskType = 'CI_JOB'
        triggerType = null
        useApproverAcl = '0'
        waitForPlannedStartDate = '0'
      }

      task 'Deploy Microservice B', {
        description = ''
        actionLabelText = null
        actualParameter = [
          'APP_NAME': 'microserviceA',
        ]
        advancedMode = '0'
        afterLastRetry = null
        allowOutOfOrderRun = '0'
        allowSkip = null
        alwaysRun = '0'
        applicationName = null
        applicationProjectName = null
        applicationVersion = null
        artifacts = null
        artifactsRegEx = null
        ciConfigurationName = 'ikurtz-cbdemos-thunder'
        ciControllerFolder = null
        ciControllerName = null
        ciEndpoint = null
        ciJobBranchName = null
        ciJobFolder = '/'
        ciJobName = 'deploy-microservice'
        command = null
        condition = null
        customLabel = null
        deployerExpression = null
        deployerRunType = null
        disableFailure = null
        duration = null
        emailConfigName = null
        enabled = '1'
        environmentName = null
        environmentProjectName = null
        environmentTemplateName = null
        environmentTemplateProjectName = null
        errorHandling = 'stopOnError'
        gateCondition = null
        gateType = null
        groupName = null
        groupRunType = null
        insertRollingDeployManualStep = '0'
        instruction = null
        notificationEnabled = null
        notificationTemplate = null
        parallelToPrevious = null
        plannedEndDate = null
        plannedStartDate = null
        postp = null
        precondition = null
        requiredApprovalsCount = null
        resourceName = ''
        retryCount = null
        retryInterval = null
        retryType = null
        rollingDeployEnabled = null
        rollingDeployManualStepCondition = null
        rolloutNotificationEnabled = null
        shell = null
        skippable = '0'
        snapshotName = null
        stageSummaryParameters = null
        startingStage = null
        subErrorHandling = null
        subTaskType = null
        subapplication = null
        subpipeline = null
        subpluginKey = null
        subprocedure = null
        subprocess = null
        subproject = 'MFS'
        subrelease = null
        subreleasePipeline = null
        subreleasePipelineProject = null
        subreleaseSuffix = null
        subworkflowDefinition = null
        subworkflowStartingState = null
        taskProcessType = null
        taskType = 'CI_JOB'
        triggerType = null
        useApproverAcl = '0'
        waitForPlannedStartDate = '0'
      }

      task 'Deploy Microservice C', {
        description = ''
        actionLabelText = null
        actualParameter = [
          'APP_NAME': 'microserviceA',
        ]
        advancedMode = '0'
        afterLastRetry = null
        allowOutOfOrderRun = '0'
        allowSkip = null
        alwaysRun = '0'
        applicationName = null
        applicationProjectName = null
        applicationVersion = null
        artifacts = null
        artifactsRegEx = null
        ciConfigurationName = 'ikurtz-cbdemos-thunder'
        ciControllerFolder = null
        ciControllerName = null
        ciEndpoint = null
        ciJobBranchName = null
        ciJobFolder = '/'
        ciJobName = 'deploy-microservice'
        command = null
        condition = null
        customLabel = null
        deployerExpression = null
        deployerRunType = null
        disableFailure = null
        duration = null
        emailConfigName = null
        enabled = '1'
        environmentName = null
        environmentProjectName = null
        environmentTemplateName = null
        environmentTemplateProjectName = null
        errorHandling = 'stopOnError'
        gateCondition = null
        gateType = null
        groupName = null
        groupRunType = null
        insertRollingDeployManualStep = '0'
        instruction = null
        notificationEnabled = null
        notificationTemplate = null
        parallelToPrevious = null
        plannedEndDate = null
        plannedStartDate = null
        postp = null
        precondition = null
        requiredApprovalsCount = null
        resourceName = ''
        retryCount = null
        retryInterval = null
        retryType = null
        rollingDeployEnabled = null
        rollingDeployManualStepCondition = null
        rolloutNotificationEnabled = null
        shell = null
        skippable = '0'
        snapshotName = null
        stageSummaryParameters = null
        startingStage = null
        subErrorHandling = null
        subTaskType = null
        subapplication = null
        subpipeline = null
        subpluginKey = null
        subprocedure = null
        subprocess = null
        subproject = 'MFS'
        subrelease = null
        subreleasePipeline = null
        subreleasePipelineProject = null
        subreleaseSuffix = null
        subworkflowDefinition = null
        subworkflowStartingState = null
        taskProcessType = null
        taskType = 'CI_JOB'
        triggerType = null
        useApproverAcl = '0'
        waitForPlannedStartDate = '0'
      }

      task 'Deploy Sample Insurance Application', {
        description = ''
        actionLabelText = null
        advancedMode = '0'
        afterLastRetry = null
        allowOutOfOrderRun = '0'
        allowSkip = null
        alwaysRun = '0'
        applicationName = null
        applicationProjectName = null
        applicationVersion = null
        artifacts = null
        artifactsRegEx = null
        ciConfigurationName = 'ikurtz-cbdemos-thunder'
        ciControllerFolder = null
        ciControllerName = null
        ciEndpoint = null
        ciJobBranchName = 'main'
        ciJobFolder = '/'
        ciJobName = 'Insurance Frontend'
        command = null
        condition = null
        customLabel = null
        deployerExpression = null
        deployerRunType = null
        disableFailure = null
        duration = null
        emailConfigName = null
        enabled = '1'
        environmentName = null
        environmentProjectName = null
        environmentTemplateName = null
        environmentTemplateProjectName = null
        errorHandling = 'stopOnError'
        gateCondition = null
        gateType = null
        groupName = null
        groupRunType = null
        insertRollingDeployManualStep = '0'
        instruction = null
        notificationEnabled = null
        notificationTemplate = null
        parallelToPrevious = null
        plannedEndDate = null
        plannedStartDate = null
        postp = null
        precondition = null
        requiredApprovalsCount = null
        resourceName = ''
        retryCount = null
        retryInterval = null
        retryType = null
        rollingDeployEnabled = null
        rollingDeployManualStepCondition = null
        rolloutNotificationEnabled = null
        shell = null
        skippable = '0'
        snapshotName = null
        stageSummaryParameters = null
        startingStage = null
        subErrorHandling = null
        subTaskType = null
        subapplication = null
        subpipeline = null
        subpluginKey = null
        subprocedure = null
        subprocess = null
        subproject = 'MFS'
        subrelease = null
        subreleasePipeline = null
        subreleasePipelineProject = null
        subreleaseSuffix = null
        subworkflowDefinition = null
        subworkflowStartingState = null
        taskProcessType = null
        taskType = 'CI_JOB'
        triggerType = null
        useApproverAcl = '0'
        waitForPlannedStartDate = '0'
      }

      task 'Deploy Validation - Run Smoke Tests', {
        description = ''
        actionLabelText = null
        advancedMode = '0'
        afterLastRetry = null
        allowOutOfOrderRun = '0'
        allowSkip = null
        alwaysRun = '0'
        applicationName = null
        applicationProjectName = null
        applicationVersion = null
        artifacts = null
        artifactsRegEx = null
        ciConfigurationName = null
        ciControllerFolder = null
        ciControllerName = null
        ciEndpoint = null
        ciJobBranchName = null
        ciJobFolder = null
        ciJobName = null
        command = null
        condition = null
        customLabel = null
        deployerExpression = null
        deployerRunType = null
        disableFailure = null
        duration = null
        emailConfigName = null
        enabled = '1'
        environmentName = null
        environmentProjectName = null
        environmentTemplateName = null
        environmentTemplateProjectName = null
        errorHandling = 'stopOnError'
        gateCondition = null
        gateType = null
        groupName = null
        groupRunType = null
        insertRollingDeployManualStep = '0'
        instruction = null
        notificationEnabled = null
        notificationTemplate = null
        parallelToPrevious = null
        plannedEndDate = null
        plannedStartDate = null
        postp = null
        precondition = null
        requiredApprovalsCount = null
        resourceName = ''
        retryCount = null
        retryInterval = null
        retryType = null
        rollingDeployEnabled = null
        rollingDeployManualStepCondition = null
        rolloutNotificationEnabled = null
        shell = null
        skippable = '0'
        snapshotName = null
        stageSummaryParameters = null
        startingStage = null
        subErrorHandling = null
        subTaskType = null
        subapplication = null
        subpipeline = null
        subpluginKey = null
        subprocedure = 'Smoke Test'
        subprocess = null
        subproject = 'MFS'
        subrelease = null
        subreleasePipeline = null
        subreleasePipelineProject = null
        subreleaseSuffix = null
        subworkflowDefinition = null
        subworkflowStartingState = null
        taskProcessType = null
        taskType = 'PROCEDURE'
        triggerType = null
        useApproverAcl = '0'
        waitForPlannedStartDate = '0'
      }
    }

    // Custom properties

    property 'ec_counters', {
      description = ''

      // Custom properties
      pipelineCounter = '3'
    }
  }

  trigger 'cb-mfs-release-trigger', {
    description = ''
    accessTokenPublicId = 'nhdzcjpw1b3r5aam5uljjort0jbqre'
    actualParameter = [
      'ec_stagesToRun': '["Release Readiness","Release"]',
    ]
    applicationName = null
    enabled = '1'
    environmentName = null
    environmentProjectName = null
    environmentTemplateName = null
    environmentTemplateProjectName = null
    insertRollingDeployManualStep = '0'
    pipelineName = null
    pluginKey = 'EC-Github'
    pluginParameter = [
      'commitStatusEvent': 'false',
      'includeBranches': 'main',
      'includeCommitStatuses': 'success',
      'includePrActions': 'closed_merged',
      'prEvent': 'false',
      'pushEvent': 'true',
      'repositories': 'ikurtz/mfs-cloudbees-cdro-pov',
    ]
    procedureName = null
    processName = null
    quietTimeMinutes = '0'
    releaseName = 'MFS - Release'
    rollingDeployEnabled = null
    rollingDeployManualStepCondition = null
    rollingDeployPhases = null
    runDuplicates = '0'
    scmSyncName = null
    serviceAccountName = 'cb-mfs-github-svc-account'
    snapshotName = null
    triggerType = 'webhook'
    webhookName = 'default'
    webhookSecretCredentialName = 'cb-mfs-svc-account-token'
    webhookSecretCredentialProjectName = 'MFS'

    // Custom properties

    property 'ec_trigger_state', {
      description = ''
      propertyType = 'sheet'
    }
  }
}
