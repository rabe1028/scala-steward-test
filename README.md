# scala-steward-test
 Test Repository for scala-steward

## Run scala-steward

```shell
docker run -v steward:/opt/scala-steward --env SCALA_STEWARD_GITHUB_API_KEY=$SCALA_STEWARD_GITHUB_API_KEY -it fthomas/scala-steward:latest \
    --workspace  "/opt/scala-steward/workspace" \
    --repos-file "/opt/scala-steward/repos.md" \
    --repo-config "/opt/scala-steward/default.scala-steward.conf" \
    --git-author-email $SCALA_STEWARD_GITHUB_EMAIL_ADDRESS \
    --vcs-api-host "https://api.github.com" \
    --vcs-login $SCALA_STEWARD_GITHUB_ACCOUNT_NAME \
    --git-ask-pass "/opt/scala-steward/token.sh" \
    --do-not-fork \
    --scalafix-migrations "/opt/scala-steward/extra-scalafix-migrations.conf" \
    --artifact-migrations "/opt/scala-steward/extra-artifact-migrations.conf" 
```
docker run -v steward:/opt/scala-steward --env SCALA_STEWARD_GITHUB_API_KEY=$SCALA_STEWARD_GITHUB_API_KEY -it fthomas/scala-steward:latest \
    --workspace  "/opt/scala-steward/workspace" \
    --repos-file "/opt/scala-steward/repos.md" \
    --repo-config "/opt/scala-steward/default.scala-steward.conf" \
    --git-author-email $SCALA_STEWARD_GITHUB_EMAIL_ADDRESS \
    --vcs-api-host "https://api.github.com" \
    --vcs-login $SCALA_STEWARD_GITHUB_ACCOUNT_NAME \
    --git-ask-pass "/opt/scala-steward/token.sh" \
    --do-not-fork \
    --scalafix-migrations "/opt/scala-steward/extra-scalafix-migrations.conf" \
    --artifact-migrations "/opt/scala-steward/extra-artifact-migrations.conf" 